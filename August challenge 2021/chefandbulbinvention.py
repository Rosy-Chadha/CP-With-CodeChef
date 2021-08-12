for _ in range(int(input())):
    n, p, k = map(int, input().split())
    tmp = 0
    day = p%k -1
    gas = ((n-1)//k)*k
    gas = n-1 -gas
    if day > gas:
        tmp += (gas+1)*((n-1)//k+1)+(day-gas)*((n-1)//k)
    else:
        tmp += ((n-1)//k +1)*(day+1)
    for i in range(day+1, n, k):
        tmp += 1
        if (i==p):
            print(tmp)