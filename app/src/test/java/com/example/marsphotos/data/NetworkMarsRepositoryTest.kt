package com.example.marsphotos.data

import com.example.marsphotos.fake.FakeDataSource
import com.example.marsphotos.fake.FakeMarsApiService
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() = runTest {
        val repository = NetworkMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )

        Assert.assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}