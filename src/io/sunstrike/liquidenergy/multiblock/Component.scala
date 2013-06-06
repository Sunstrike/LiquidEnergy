package io.sunstrike.liquidenergy.multiblock

/*
 * Component
 * io.sunstrike.liquidenergy.multiblock
 */

/**
 * Part type enum
 *
 * @author Sunstrike
 */
object Component extends Enumeration {

    type Component = Value

    val Core = Value("Core")
    val Tank = Value("Tank")
    val Struct = Value("Struct")
    val EnergyIn = Value("EnergyIn")
    val EnergyOut = Value("EnergyOut")
    val ValveIn = Value("ValveIn")
    val ValveOut = Value("ValveOut")

}
