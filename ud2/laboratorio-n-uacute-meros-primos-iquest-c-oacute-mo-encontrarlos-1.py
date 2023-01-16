def is_prime(num):
    primo = True
    for i in range (2,num//2+1):
        if num % i == 0:
            return False
    return True

for i in range(1, 20000000):
	if is_prime(i + 1):
			print(i + 1, end=" ")
print()
