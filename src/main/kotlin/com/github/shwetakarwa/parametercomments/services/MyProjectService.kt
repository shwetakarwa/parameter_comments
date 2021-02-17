package com.github.shwetakarwa.parametercomments.services

import com.github.shwetakarwa.parametercomments.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
