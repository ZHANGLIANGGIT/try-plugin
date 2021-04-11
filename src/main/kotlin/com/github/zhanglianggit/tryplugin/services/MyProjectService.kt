package com.github.zhanglianggit.tryplugin.services

import com.github.zhanglianggit.tryplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
