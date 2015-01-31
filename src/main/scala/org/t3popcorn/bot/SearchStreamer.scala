package org.t3popcorn.bot

import twitter4j._

object SearchStreamer extends AuthConfiguration {

  def main(args: Array[String]) {

    val twitterStream = new TwitterStreamFactory(cb.build()).getInstance()

    twitterStream.addListener(Util.simpleStatusListener)
    twitterStream.filter(new FilterQuery().track(Util.searchTerms))
  }
}