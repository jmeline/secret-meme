import math
def find_nb(m):
    square = m ** (1/3.0)

    print "Volume: ", m
    print "Cube: ", square
    x = 1
    res = 0
    while res < square:
        print "x: ", x, " res: ", res
        res += x
        x += 1
    if res == square:
        return x-1
    return -1

print "find_nb(36): ", find_nb(36)
print "find_nb(100): ", find_nb(100)
print "find_nb(225): ", find_nb(225)
print "find_nb(441): ", find_nb(441)
# print "find_nb(1071225): ", find_nb(1071225)
# print "find_nb(4183059834009): ", find_nb(4183059834009)
# print "find_nb(24723578342962): ", find_nb(24723578342962)
# print "find_nb(91716553919377): ", find_nb(91716553919377)
# print "find_nb(1025247423603083074023000250000): ", find_nb(1025247423603083074023000250000)
# print "find_nb(10252519345963644753026): ", find_nb(10252519345963644753026)
#
# (def large-N 1025247423603083074023000250000N)
# (def large-N2 10252519345963644753026N)
# (println (find-nb-faster 4183059834009)) ; => 2022
# (println (find-nb-faster 24723578342962)) ; => -1
# (println (find-nb-faster 91716553919377)) ; => -1
# (println (find-nb-faster large-N)) ; => 45001000
# (println (find-nb-faster large-N2)) ; => -1
