def is_year_leap(year):
    if year < 1582:
        return False
    else:
        if year % 4 != 0:
            return False
        elif year % 100 != 0:
            return True
        elif year % 400 != 0:
            return False
        else:
            return True

test_data = [1900, 2000, 2016, 1987]
test_results = [False, True, True, False]
for i in range(len(test_data)):
	yr = test_data[i]
	print(yr,"->",end="")
	result = is_year_leap(yr)
	if result == test_results[i]:
		print("OK")
	else:
		print("Fallido")

def days_in_month(year, month):
    if month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12:
        return 31
    elif month == 4 or month == 6 or month == 9 or month == 11:
        return 30
    elif month == 2:
        if is_year_leap(year):
            return 29
        else:
            return 28
    else:
        return -1
def day_of_year(year, month, day):
    diasMes = days_in_month(year,month)
    if year > 0 and day > 0 and diasMes != None and day<= diasMes:
       print("fecha Correcto.Pendiente calcular el numero de dia: ")
       numDias = day
       for in range (1,month):
        numDias += day_of_year (year,i)
        return numDias
    else:
        return None

diasDelAño = (day_of_year(2000, 12, 31))

