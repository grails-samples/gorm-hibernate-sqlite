package demo

class BootStrap {

    def init = { servletContext ->
        Book.withTransaction {
            if ( !Book.findByName('The definitive Grails Guide') ) {
                Book.saveAll(
                        new Book(name: 'The definitive Grails Guide')
                )
            }
        }
    }
    def destroy = {
    }
}
