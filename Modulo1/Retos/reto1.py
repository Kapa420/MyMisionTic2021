"""Reto #1."""
"""15% para las compras. 15% para pasajes.
20% para boletos. 5% para libros."""
salary = int(input())
buy = salary * (15/100)
bus = salary * (15/100)
movie = salary * (20/100)
books = salary * (5/100)
salary -= buy + bus + movie + books
print(salary)
