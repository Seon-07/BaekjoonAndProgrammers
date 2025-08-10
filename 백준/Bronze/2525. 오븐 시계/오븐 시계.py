A, B = map(int, input().split())
C = int(input())
totalMin = (A*60)+B+C
if totalMin >= 1440:
    totalMin -= 1440
H = totalMin // 60
M = totalMin % 60
print(H, M)

    
    