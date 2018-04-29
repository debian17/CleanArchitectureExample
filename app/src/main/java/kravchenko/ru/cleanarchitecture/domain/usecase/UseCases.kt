package kravchenko.ru.cleanarchitecture.domain.usecase

import io.reactivex.Single
import kravchenko.ru.cleanarchitecture.data.model.Person
import kravchenko.ru.cleanarchitecture.data.model.User
import kravchenko.ru.cleanarchitecture.data.repository.Repository

//split this usecases into multiple files

fun getUsersUseCase(): () -> Single<List<User>> {
    return Repository().getUsers()
}

fun getPersonsUseCase(): Single<List<Person>> {
    return Repository().getPersons()
}