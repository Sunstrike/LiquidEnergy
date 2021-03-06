package io.sunstrike.transformers.lib

/*
 * Constants
 * io.sunstrike.transformers.lib
 */

/**
 * Constants for use throughout.
 *
 * @author Sunstrike
 */
object Constants {

    final val modId = "Transformers"
    final val modName = "Energy Transformers"
    final val version = "@VERSION@"
    final val modDeps = ""
    final val modLang = "scala"

    // Calculated by: units per item in furnace cost --> 6240/x --> x5 --> Result mb/unit
    // 6240 was chosen as gcd of EU/item and MJ/item. 5 is simply a modifier to decide how much should be produced overall.
    final val mbPerEU = 80
    final val mbPerMJ = 195
    final val mbPerSteamMb = 39

}
