class User {
    private long id;
    private Vacancy vacancy;

    User(long id, String name){
        this.id = id;
        this.vacancy = new Vacancy(name);
    }


    String getVacancy() {
        return vacancy.getVacancy();
    }
    long getId() {
        return id;
    }
}
