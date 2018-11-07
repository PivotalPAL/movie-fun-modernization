package org.superbiz.moviefun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.superbiz.moviefun.albums.Album;
import org.superbiz.moviefun.albums.AlbumFixtures;
import org.superbiz.moviefun.albums.AlbumsBean;*/
import org.superbiz.moviefun.movies.MoviesRepository;
import org.superbiz.moviefun.moviesapi.MovieFixtures;


import java.util.Map;

@Controller
public class HomeController {

    private final MoviesRepository moviesRepository;

    private final MovieFixtures movieFixtures;


    /*public HomeController(MoviesRepository moviesRepository, AlbumsBean albumsBean, MovieFixtures movieFixtures, AlbumFixtures albumFixtures) {
        this.moviesRepository = moviesRepository;
        this.albumsBean = albumsBean;
        this.movieFixtures = movieFixtures;
        this.albumFixtures = albumFixtures;
    }*/
    public HomeController(MoviesRepository moviesRepository, MovieFixtures movieFixtures ) {
        this.moviesRepository = moviesRepository;
        this.movieFixtures = movieFixtures;

    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    /*@GetMapping("/setup")
    public String setup(Map<String, Object> model) {
        for (Movie movie : movieFixtures.load()) {
            //moviesRepository.addMovie(movie);
            moviesRepository.addMovie(movie);
        }

        for (Album album : albumFixtures.load()) {
            albumsBean.addAlbum(album);
        }

        model.put("movies", moviesRepository.getMovies());
        model.put("albums", albumsBean.getAlbums());

        return "setup";
    }*/
}
