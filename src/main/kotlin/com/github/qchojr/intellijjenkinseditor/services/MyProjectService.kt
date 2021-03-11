package com.github.qchojr.intellijjenkinseditor.services

import com.github.qchojr.intellijjenkinseditor.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
