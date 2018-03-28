package com.myplugin.lib

import org.gradle.api.Plugin
import org.gradle.api.Project

public class myplugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        println "hello, this is cooker plugin!"

        //比如这里加一个简单的task
        project.task('cooker-test-task') << {
            println "hello, this is cooker test task!"
        }
    }
}