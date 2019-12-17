Integer fuelCalc(Integer mass) {
    Integer fuel = mass / 3 - 2

    if (fuel < 0) {
        return 0
    }

    return fuel
}


Integer realFuel(Integer mass) {
    Integer total = 0
    Integer subTotal = fuelCalc(mass)
    total += subTotal
    while (subTotal > 0) {
        subTotal = fuelCalc(subTotal)
        total += subTotal
    }

    return total
}

Integer runningTotal = 0

new File("part1.txt").eachLine { line ->
    runningTotal += realFuel(line.toInteger())
}
println runningTotal