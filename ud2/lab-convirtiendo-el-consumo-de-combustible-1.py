def liters_100km_to_miles_gallon(liters):
    metros_milla = 1609.344
    litros_galon = 3.785411784
    galones_100km= liters / litros_galon
    galones_km = liters / litros_galon /100
    km_por_galon = 1 / galones_km
    millas_por_galon = km_por_galon / metros_milla/1000
    return millas_por_galon
def miles_gallon_to_liters_100km(miles):
    metros_milla = 1609.344
    litros_galon = 3.785411784
    km100 = miles  * metros_milla /1000/100
    return litros_galon/ km100

print(liters_100km_to_miles_gallon(3.9))
print(liters_100km_to_miles_gallon(7.5))
print(liters_100km_to_miles_gallon(10.))
print(miles_gallon_to_liters_100km(60.3))
print(miles_gallon_to_liters_100km(31.4))
print(miles_gallon_to_liters_100km(23.5))
