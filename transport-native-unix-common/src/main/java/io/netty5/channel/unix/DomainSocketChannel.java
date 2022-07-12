/*
 * Copyright 2015 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty5.channel.unix;

import io.netty5.channel.ChannelOption;

/**
 * A {@link UnixChannel} that supports communication via
 * <a href="https://en.wikipedia.org/wiki/Unix_domain_socket">Unix Domain Socket</a>.
 *
 * <h3>Available options</h3>
 *
 * In addition to the options provided by {@link UnixChannel},
 * {@link DomainSocketChannel} allows the following options in the option map:
 *
 * <table border="1" cellspacing="0" cellpadding="6">
 * <tr>
 * <th>Name</th><th>Associated setter method</th>
 * </tr><tr>
 * <td>{@link ChannelOption#SO_SNDBUF}</td>
 * </tr><tr>
 * <td>{@link ChannelOption#SO_RCVBUF}</td>
 * </tr>
 * </table>

 */
public interface DomainSocketChannel extends UnixChannel {
    @Override
    DomainSocketAddress remoteAddress();

    @Override
    DomainSocketAddress localAddress();
}