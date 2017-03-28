package kwetter1.service;

import org.assertj.core.api.IntegerAssert;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import twitter_webservice.doa.TweetDAO_impl;
import twitter_webservice.domain.Tweet;
import twitter_webservice.service.TweetMgr;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;


/**
 * Created by Anna-May on 16/03/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class TweetMgrTest {
    @InjectMocks
    TweetMgr tweetMgr;

    @Mock
    TweetDAO_impl tweetDao_impl;

    public TweetMgrTest() {

    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getTweets() {
        Tweet mockTweet = mock(Tweet.class);

        when(tweetDao_impl.findAll().get(0)).thenReturn(mockTweet);
        Tweet result = tweetDao_impl.findAll().get(0);

        verify(tweetDao_impl, times(1)).findAll().get(0);
        assertEquals(result, mockTweet);
    }

    @Test
    public void getTweetsByUserName() {

    }
}
