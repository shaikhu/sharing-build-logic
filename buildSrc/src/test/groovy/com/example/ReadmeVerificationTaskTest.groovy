package com.example

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class ReadmeVerificationTaskTest extends Specification {
    def 'convention plugin applies readme task'() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply('myproject.library-conventions')

        then:
        project.tasks.findByName('readmeCheck') != null
    }
}
