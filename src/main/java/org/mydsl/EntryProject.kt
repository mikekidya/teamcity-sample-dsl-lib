package org.mydsl

import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.RelativeId
import java.util.Properties

class EntryProject(private val props: Properties = Properties()): Project({

    buildType {
        id = RelativeId("build")
        name = "Build: ${props["name"]}"
    }

})
