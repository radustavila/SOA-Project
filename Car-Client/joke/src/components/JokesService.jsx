import React from 'react'
import api from '../services/api'


export class JokesService {

    static getJoke() {
        return api.get(`jokes/random`)
    }

}