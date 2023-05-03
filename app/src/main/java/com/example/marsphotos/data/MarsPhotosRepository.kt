package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

interface MarsPhotosRepository {
    //funcion abstracta
    suspend fun getMarsPhotos(): List<MarsPhoto>

}

class DefaultMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository
{
    //anula función abstracta
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        //muestra datos
        return marsApiService.getPhotos()


    }
}