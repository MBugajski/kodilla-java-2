package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User mike = new ZGeneration("Mike Rally");

        //When
        String stevenShares = steven.sharePost();
        System.out.println("Steven: " + stevenShares);
        String johnShares = john.sharePost();
        System.out.println("John: " + johnShares);
        String mikeShares = mike.sharePost();
        System.out.println("Mike: " + mikeShares);

        //Then
        Assert.assertEquals("Publishing on Facebook", stevenShares);
        Assert.assertEquals("Publishing on Twitter", johnShares);
        Assert.assertEquals("Publishing on Snapchat", mikeShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShares = steven.sharePost();
        System.out.println("Steven: " + stevenShares);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenShares = steven.sharePost();
        System.out.println("Steven now: " + stevenShares);

        //Then
        Assert.assertEquals("Publishing on Twitter", stevenShares);
    }
}
