package repository

import models.Contributor

object EntitiesRepository {

    fun contributorsList() = listOf(
        Contributor("Marcelo", 50.0),
        Contributor("Matheus", 40.0),
        Contributor("Mauro", 60.0),
        Contributor("Renato", 40.0),
        Contributor("Henrique", 30.0),
        Contributor("João", 30.0),
        Contributor("Russo", 150.0),
        Contributor("Pedro", 40.0),
        Contributor("Mayer", 90.0),
        Contributor("Madu", 80.0),
        Contributor("Lucas", 50.0),
        Contributor("Akme-Re", 70.0)
    )
}