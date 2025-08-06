A, B = map(int, input().split())
if B >= 45 :
    print(A, B-45)
else :
    A = A - 1 if A != 0 else 23
    print(A, B+15)