package com.github.plexpt.intellijqq.services

import com.github.plexpt.intellijqq.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
