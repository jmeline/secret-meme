n, t = map(int, input().strip().split(' '))
assert n >= 2
assert n <= 100000 
assert t >= 1
assert t <=1000
a = list(map(int, input().strip().split(' ')))

for test in range(int(t)):
    i,j = list(map(int, input().strip().split(' ')))
    print(min(a[i:j+1]))