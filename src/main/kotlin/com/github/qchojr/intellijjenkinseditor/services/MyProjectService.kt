package com.github.qchojr.intellijjenkinseditor.services

import com.intellij.openapi.project.Project
import com.github.qchojr.intellijjenkinseditor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
