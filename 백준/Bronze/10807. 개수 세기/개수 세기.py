N = int(input())
arr = list(map(int, input().split()))
X = int(input())
cnt = 0
for i in arr :
    if  X == i :
        cnt+=1;
print(cnt)