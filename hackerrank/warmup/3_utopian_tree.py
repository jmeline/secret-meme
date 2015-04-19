
numTests= int(input())
#print (numTests)

for x in range(numTests):
    # obtain N
    numCycles = int(input())

    # initial height = 1
    height = 1

    while(True):
        # First Growth cycle: Monsoon Season
            # height * 2
        if numCycles >= 1:
            height *= 2
            numCycles -= 1;
        else:
            break;
        # Second Growth Cycle: Summer
            # height += 1
        if numCycles >= 1 :
            height += 1
            numCycles -= 1;
        else:
            break;
    print (height)






