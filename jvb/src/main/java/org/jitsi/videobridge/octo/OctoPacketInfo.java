/*
 * Copyright @ 2019-Present 8x8, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jitsi.videobridge.octo;

import org.jetbrains.annotations.*;
import org.jitsi.nlj.*;
import org.jitsi.rtp.*;

/**
 * Currently we only use this to recognize packets coming from Octo.
 */
public class OctoPacketInfo extends PacketInfo
{
    @Nullable private final String meshId;
    public OctoPacketInfo(@NotNull Packet packet)
    {
        super(packet);
        meshId = null;
    }

    public OctoPacketInfo(@NotNull Packet packet, @Nullable String meshId)
    {
        super(packet);
        this.meshId = meshId;
    }

    public String getMeshId()
    {
        return meshId;
    }
}
