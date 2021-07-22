package com.github.lunakoly.intellijquicklink.services

import com.github.lunakoly.intellijquicklink.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {
    init {
        println(MyBundle.message("projectService", project.name))
    }
}
