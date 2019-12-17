Integer fuelCalc(Integer mass) {
    Integer truncatedDivision = mass / 3
    return truncatedDivision - 2
}

Integer runningTotal = 0

new File("AOC1.txt").eachLine { line ->
    runningTotal += fuelCalc(line.toInteger())
}