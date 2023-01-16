#Constantes
pre_KW_año_potencia_punta = 30.67266
pre_KW_año_potencia_valle = 1.424359
dias = 365
pre_KW_anual = 3.113
pre_KWh_consumo_punta = 0.133118
pre_KWh_consumo_llano = 0.041772
pre_KWh_consumo_valle = 0.006001
pre_KWh_consumo_total = 0.1321
porcentaje_impuesto_electrico = 5.11269632
alquiler_contador = 0.81
IVA = 10

#Entrada de información
potPunta = float(input("Introduce la Potencia Punta "))
potValle = float(input("Introduce la Potencia Valle "))
conPunta = float(input("Introduce la Consumo Punta "))
conLlano = float(input("Introduce la Consumo Llano "))
conValle = float(input("Introduce la Consumo Valle "))
diasFacturables = float(input("Introduce los dias faturables "))

#Calculos
terminoFijo = (potPunta * pre_KW_año_potencia_punta * diasFacturables / dias) + (potValle*pre_KW_año_potencia_valle*diasFacturables /dias) + ((potPunta+potValle) / 2 * pre_KW_anual *diasFacturables /dias)
terminoVariable = (conPunta*pre_KWh_consumo_punta) + (conLlano*pre_KWh_consumo_llano) + (conValle*pre_KWh_consumo_valle) + ((conLlano+conPunta+conValle)*pre_KWh_consumo_total)
impuestoElectrico = (terminoFijo+terminoVariable)/100*porcentaje_impuesto_electrico
equipoDeMedida = alquiler_contador
pre_IVA = (terminoFijo+terminoVariable+impuestoElectrico + equipoDeMedida)/100*IVA
pre_Total = terminoFijo+terminoVariable+impuestoElectrico + equipoDeMedida + pre_IVA

#Salida de la informción
print("resumen de la factura")
print("Término Fijo ", round (terminoFijo,2),"€")
print("Término Variable ", round(terminoVariable,2),"€")
print("Impuesto eléctrico ", round(impuestoElectrico,2),"€")
print("equipo de medida ",round (equipoDeMedida,2),"€")
print("IVA ",round(pre_IVA,2),"€")
print("Total factura ", round(pre_Total,2),"€")
