for i in range(int(input())):
	N = int(input())
	S = list(map(int, input().split(" ")))
	m = S[0]
	a = m
	for i in range(1,N):
		S[i] = min(m, S[i])
		m = S[i]
		a = a + m
	print(a)