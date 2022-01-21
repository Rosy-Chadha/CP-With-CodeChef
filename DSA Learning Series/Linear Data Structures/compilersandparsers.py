for i in range(int(input())):
    S = input().strip()
    c = 0
    t = 0
    for i in range(len(S)):
        if S[i] == "<":
            t = t + 1
        else:
            t = t - 1
            if t == 0:
                c = max(c, i+1)
            elif t < 0:
                break
    print(c)

