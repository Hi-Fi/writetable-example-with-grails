class UrlMappings {

	static mappings = {
		"/api/rest"(resources:'rest')
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
