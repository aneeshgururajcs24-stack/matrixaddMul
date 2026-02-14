n=int(input("enter n:"))
m=int(input("enter m:"))
p=int(input("enter p:"))

arr=[[0]*m for _ in range(n)]
arr1=[[0]*p for _ in range(m)]
result=[[0]*p for _ in range(n)]
result1=[[0]*p for _ in range(n)]

for i in range(n):
    for j in range(m):
        arr[i][j]=int(input())

for i in range(n):
    for j in range(m):
        arr1[i][j]=int(input())


for i in range(n):
    for j in range(m):
        result[i][j]=arr[i][j]+arr1[i][j]


for i in range(n):
    for j in range(p):
        for k in range(m):
             result1[i][j] += arr[i][k] * arr1[k][j]


