size = int(input())
assert size % 2 == 1

lst = [int(x) for x in input().split()]
#print (lst)
for i in range(len(lst)+1):
    tmp = lst.pop()
    #print (lst, "%s[%s]: %s"%(tmp, i, lst[i]), sep=' ')
    
    if not tmp in lst:
        print (tmp)
        break
        
    lst.insert(0, tmp)

