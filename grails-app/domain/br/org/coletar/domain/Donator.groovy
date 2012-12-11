package br.org.coletar.domain

import grails.test.mixin.Mock
import grails.validation.Validateable

@Validateable
@Mock(User)
class Donator {

    User user

    static constraints = {
        user blank: false
    }

}
