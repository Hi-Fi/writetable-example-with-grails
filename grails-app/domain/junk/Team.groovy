package junk

class Team {
	static marshalling={
		shouldOutputIdentifier true
		shouldOutputVersion false
		shouldOutputClass false
		deep 'players'
	}
    String name
    List players

    static hasMany = [players : Player]

    static mapping = {
        players cascade:"all-delete-orphan"
    }
}
