package com.github.varenyzc.go2kotlin.services

import com.intellij.openapi.project.Project
import com.github.varenyzc.go2kotlin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
