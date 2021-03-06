package br.org.coletar.domain

import grails.validation.Validateable

@Validateable
class CollectionStationItemTypeLimits {

    CollectionStation collectionStation
    CollectItemType collectItemType
    Integer minLimit
    Integer maxLimit

    static constraints = {
        minLimit min: 1
        maxLimit min: 1
        collectionStation unique: 'collectItemType'
    }
}
