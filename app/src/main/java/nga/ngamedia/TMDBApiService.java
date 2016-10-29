package nga.ngamedia;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by gerard on 10/6/16.
 */
public interface TMDBApiService {
    @GET("/discover/movie?primary_release_date.gte=2014-09-15&primary_release_date.lte=2019-10-22&sort_by=popularity.desc")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
