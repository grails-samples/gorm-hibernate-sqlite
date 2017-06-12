package demo

import grails.transaction.Transactional

class BookController {

    @Transactional(readOnly = true)
    def index() {
        def bookNames = Book.createCriteria().list {
            projections {
                property('name')
            }
        }
        render bookNames
    }
}