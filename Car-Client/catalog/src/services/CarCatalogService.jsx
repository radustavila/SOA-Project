import React from 'react'
import api from './api'

export class CarCatalogService {

    static getCatalog() {
        return api.get(`catalog/1`)
    }

}