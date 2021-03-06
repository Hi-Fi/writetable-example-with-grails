package junk

import grails.converters.JSON

class RestController {

    def index() {
        render Team.list() as JSON
    }

    def create() {

    }

    def save(Team team) {
		team.players.each {it.team = team}
        if(team.save()) {
			render team as JSON
		} else {
			render "Could not save\n ${team.errors}"
		}
        
    }


    def show(Long id) {
		def team = Team.get(id)
		if (team != null) {
			render team as JSON
		} else {
			render "Not found"
		}
    }
}
