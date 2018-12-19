SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Julio Arboleda
-- Create date: 2018-12-19
-- Description:	permite saber el estado de resultados por producto hasta una fecha dada
-- =============================================
CREATE FUNCTION estado_de_resultados_por_producto
(	
	@hasta datetime2
	
)
RETURNS TABLE 
AS
RETURN 
(
	with movimientos as (
		select 
			PRODUCTO_ID,
			SUM(M.DEBITO) AS DEBITO,
			SUM(M.CREDITO) AS CREDITO
		from MOVIMIENTO M
		where M.FECHA <= @hasta
		group by M.PRODUCTO_ID
	), pre AS (
		select 
			P.ID,
			P.NOMBRE,
			DEBITO-CREDITO AS STOCK,
			CREDITO*VALOR_VENTA AS INGRESOS,
			DEBITO*VALOR_COMPRA AS EGRESOS
		from PRODUCTO P
		left join movimientos M
		on p.ID = M.PRODUCTO_ID
	)
	SELECT pre.ID, 
	pre.NOMBRE,
	IsNull(pre.STOCK,0) as STOCK,
	IsNull(pre.INGRESOS,0) as INGRESOS,
	IsNull(pre.EGRESOS,0) as EGRESOS,
	IsNull(pre.INGRESOS - pre.EGRESOS,0) as  GANANCIAS  
	from pre
)
GO
