package com.shilapi.xcertplay.network

/**
 * Zeekr head units run Zeekr OS 7.2.5 on the `msmnile` platform. Their soft hotspot hands the
 * interface a link-local IPv6 address first and the IPv4 address only once the group is fully
 * up, and the hotspot does not forward IPv6 link-local multicast between the head unit and the
 * phone.
 *
 * A JmDNS instance joins only its own address family's multicast group, so an IPv6 publication
 * leaves the receiver unable to observe the iPhone's `_carplay-control` service even though the
 * phone has joined the hotspot. The Zeekr edition therefore publishes the IPv4 endpoint whenever
 * the hotspot interface exposes one, and waits for that address to appear instead of settling on
 * the early IPv6 snapshot.
 */
internal object WirelessAddressFamilyPolicy {
    /** Waits for a usable IPv4 address rather than publishing the first IPv6 snapshot. */
    const val WAIT_FOR_IPV4 = true

    /** Publishes IPv4 when the hotspot interface offers one. */
    const val PREFER_IPV4 = true
}
