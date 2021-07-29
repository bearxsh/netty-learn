package com.bearxsh.nettylearn.test;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author bearx
 */
public class Example_01 {
    public static void main(String[] args) {
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 2005);
        ChannelFuture channelFuture = (ChannelFuture) bootstrap.group(group).channel(NioSocketChannel.class);
        channelFuture.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if (channelFuture.isSuccess()) {
                    System.out.println("🔗成功");
                } else {
                    System.out.println("连接失败");
                }
            }
        });
    }
}
